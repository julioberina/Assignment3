Programmer: Julio Berina

Assignment: This assignment was a Java Object-Oriented implementation of the game Memory.

Approach to solution: Although I created more classes than I should, it actually turned out well in
the end to make an abstract Card and create a class for each type of Card.  Most methods associated
with the subclasses of Card were written in Card, which left each of subclasses with only a
constructor implementation that calls the constructor of Card supplied with a String.  The string
supplied represents an ASCII representation of its type as a real-life card.  In terms of gameplay,
I made separate methods to have the user pick the first card and the second card as well as the
method that checks if they match.  If they do match, set their indexes in the List to null. Speaking
of List, I created a List<Card> object that stores two of each subclass instance.  The way the grid is displayed on the screen is that if it's face-down, it would print its order (1-based numbering)
in the multidimensional array.  If the card was flipped up, it would display the symbol "underneath"
the card.  If the value of the symbol at the picked number is null, it returns an empty string. The
game is won when all items in List<Card> are null.

Conclusions and lessons learned: I still need to work on my design and method implementation, but I
will say that I have improved drastically since the second assignment.  Either that or this
assignment doesn't really have intensive requirements as the previous.  Either way, I learned to
write better methods and make better names for them as well, which made the development process
easier in the long run.
