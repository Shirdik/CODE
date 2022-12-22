#include <iostream>
#include <algorithm>
using namespace std;

enum suits
{
    diamond,
    club,
    heart,
    spade
};
class Card
{
public:
    Card();
    Card(suits, int);

    int rank;
    suits suit;
};

Card::Card()
{
    rank = 1;
    suit = spade;
}
Card::Card(suits sv, int rv)
{
    rank = rv;
    suit = sv;
}

ostream &operator<<(ostream &out, Card &aCard)

{
    switch (aCard.rank)
    {
    case 1:
        out << "Ace";
        break;
    case 11:
        out << "Jack";
        break;
    case 12:
        out << "Queen";
        break;
    case 13:
        out << "King";
        break;
    default:
        out << aCard.rank;
        break;
    }
    switch (aCard.suit)
    {
    case diamond:
        out << " of Diamonds";
        break;
    case spade:
        out << " of Spades";
        break;
    case heart:
        out << " of Hearts";
        break;
    case club:
        out << " of Clubs";
        break;
    }
    return out;
}

class randomInteger
{
public:
    int operator()(int);
} randomizer;

int randomInteger::operator()(int max)
{
    // rand return random integer
    // convert to unsigned to make positive
    // take remainder to put in range
    int rval = rand();
    return rval % max;
}

class Deck
{
public:
    // constructor
    Deck();

    // operations
    void shuffle()
    {
        random_shuffle(cards, cards + 52);
        // for (int i = 0; i < 52; i++)
        //     cout << cards[i] << endl;
    }
    bool isEmpty()
    {
        return topCard <= 0;
    }
    Card draw();

protected:
    Card cards[52];
    int topCard;
};

Deck::Deck()
// initialize a deck by creating all 52 cards
{
    topCard = 0;
    for (int i = 1; i <= 13; i++)
    {
        Card c1(diamond, i), c2(spade, i), c3(heart, i), c4(club, i);
        cards[topCard++] = c1;
        cards[topCard++] = c2;
        cards[topCard++] = c3;
        cards[topCard++] = c4;
    }
}

Card Deck::draw()
// return one card from the end of the deck
{
    if (!isEmpty())
        return cards[--topCard];
    else
    { // otherwise return ace of spades
        Card spadeAce(spade, 1);
        return spadeAce;
    }
}

class Player
{
public:
    // constructor
    Player(Deck &);
    // operators
    virtual Card draw() = 0;
    void addPoints(int);
    int score();
    void replaceCard(Deck &);

protected:
    Card myCards[3];
    int myScore;
    int removedCard;
};

Player::Player(Deck &aDeck)
// initialize the data fields for a player
{
    myScore = 0;
    for (int i = 0; i < 3; i++)
        myCards[i] = aDeck.draw();
    removedCard = 0;
}

Card Player::draw()
// return a random card from our hand
{
    removedCard = randomizer(3);
    return myCards[removedCard];
}

void Player::addPoints(int howMany)
// add the given number of points to the current score
{
    myScore += howMany;
}

int Player::score()
// return the current score
{
    return myScore;
}

void Player::replaceCard(Deck &aDeck)
// replace last card played with new card
{
    myCards[removedCard] = aDeck.draw();
}
// Class Human Player
class humanPlayer : public Player
{
public:
    humanPlayer(Deck &aDeck) : Player(aDeck) {}
    Card draw();
};
Card humanPlayer::draw()
{
    cout << "you currently hold in your hand:" << endl;
    cout << "a) " << myCards[0] << endl;
    cout << "b) " << myCards[1] << endl;
    cout << "c) " << myCards[2] << endl;
    cout << "Which one do you want to play? ";
    char answer;
    removedCard = -1;
    while (removedCard == -1)
    {
        cin >> answer;
        switch (answer)
        {
        case 'a':
            removedCard = 0;
            break;
        case 'b':
            removedCard = 1;
            break;
        case 'c':
            removedCard = 2;
            break;
        default:
            cout << "Please specify a, b, or c" << endl;
            break;
        }
    }
    return myCards[removedCard];
}

// Machine Player
class machinePlayer : public Player
{
public:
    machinePlayer(Deck &aDeck) : Player(aDeck) {}
    Card draw();
};

Card machinePlayer::draw()
{
    removedCard = rand() % 3;
    cout << "draws " << myCards[removedCard] << endl;
    return myCards[removedCard];
}

// Main method
int main()
{
    // srand(unsigned(time(0)));
    Deck theDeck;
    theDeck.shuffle();
    Player *pp1 = 0;
    Player *pp2 = 0;
    while (!pp1)
    {
        cout << "Is player 1 a human or a machine? ";
        string answer;
        cin >> answer;
        if (answer == "human")
            pp1 = new humanPlayer(theDeck);
        else if (answer == "machine")
            pp1 = new machinePlayer(theDeck);
    }
    while (!pp2)
    {
        cout << "Is player 2 a human or a machine? ";
        string answer;
        cin >> answer;
        if (answer == "human")
            pp2 = new humanPlayer(theDeck);
        else if (answer == "machine")
            pp2 = new machinePlayer(theDeck);
        // the same as for pp1.
    }
    Player &player1 = *pp1;
    Player &player2 = *pp2;
    while (!theDeck.isEmpty())
    {
        // Essentially the same as before.
        Card card1 = player1.draw();
        cout << "Player 1 plays " << card1 << endl;
        Card card2 = player2.draw();
        cout << "Player 2 plays " << card2 << endl;

        if (card1.rank == card2.rank)
        { // tie
            player1.addPoints(1);
            player2.addPoints(1);
            cout << "Players tie\n";
        }
        else if (card1.rank > card2.rank)
        {
            player1.addPoints(2);
            cout << "Player 1 wins round\n";
        }
        else
        {
            player2.addPoints(2);
            cout << "Player 2 wins round\n";
        }

        // now replace the cards drawn
        player1.replaceCard(theDeck);
        player2.replaceCard(theDeck);
    }
    cout << "Player 1 score " << player1.score() << endl;
    cout << "Player 2 score " << player2.score() << endl;
    return 0;
}
