##Extra Functionality

The standard Mr. PotatoHead had a few more extra functionality than the prescribed app. 



1. **Dress all button**

   An extra button on the bottom left of the screen which does the same as checking all the boxes

2. **Clear all button**
   Which does the same as unchecking everything at once. 

3. **Text color changes to match the checkbox color**

   - [x] arms
   - [x] Legs

   When having the body parts checked, the check sign is set in a color. The text is then automatically changed to match the following color. Observe the difference in the following screen shot. 

   ![Half checked](https://github.com/artix15/Mr.-PotatoHead/blob/master/doc/vertical%20-%20few%20selected.png)

4. **Everything is setup in objects**
   In the code a bodyPart object is created. This eases the coding and is good practice; however, one could argue it's a bit overkill for such a small. 

5. **The code is shortened very much by looping over everything.**
   Without the comments, only 16 lines of codes are present in the checkClicked method.

6. **Appropriate use of comments types**

   For example before a constructor in the class, code is

   ```java
       /**
        * Default constructor for body part
        * @param name
        * @param id
        * @param checkboxId
        */
   public bodyPart(String name, int id, int checkboxId) {
    ....   
   }
   ```

Whether before in methods there are normal multiline code and just clarification is done in single line code. This allows for easy creation of **Java API Documentation**. 



