# Hangman async
Hangman game built in Java with async callback and picture printout in console.


# About
The game is a words guessing game for one player. 
The word to guess is represented by a row of dashes, representing each letter of the word.
The player chooses dictionary, then the computer guesses a word
and the user suggests letters one by one. 
In the beginning the user has 8 trials (8 lives).
Every time the word doesn't contain a letter, 
the computer gives a penalty point, that's remove one life.
If there is 0 lives, the user looses.
The user won when he guesses all letters.
The picture of gallows is displayed when user miss the letter.

&nbsp;# # # # # # # #   
&nbsp;#&nbsp;   &nbsp;  &nbsp;   &nbsp;   &nbsp;  &nbsp;  &nbsp;&nbsp;|   
&nbsp;#&nbsp;   &nbsp;  &nbsp;   &nbsp;   &nbsp;  &nbsp;  &nbsp;&nbsp;|   
&nbsp;#&nbsp;   &nbsp;  &nbsp;   &nbsp;   &nbsp;  &nbsp; (';')   
&nbsp;#&nbsp;   &nbsp;  &nbsp;   &nbsp;   &nbsp;  &nbsp;   &nbsp;/|\   
&nbsp;# &nbsp;   &nbsp;  &nbsp;   &nbsp;   &nbsp;  &nbsp; / \   
&nbsp;#   
&nbsp;#   
&nbsp;# # # # # # # #   



# How to run 
**Compiling with pure Java**    

- First, copy all files from HangManAsyncJB/src  directory to any folder, for ex. to HangManAsync directory
- Then, build it:     
```   
cd HangManAsync  
```   
```   
$ javac HangManMain.java  
```   

- Then, run:   
```   
$ java HangManMain   
```     
  
**Compiling with Maven**   

- First, create a project:
```
$  mvn archetype:generate -DgroupId=com.hangmanasync.app -DartifactId=HangManAsync -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false    
```   

- Then replace App.java file in directory HangManAsync\src\main\java\com\hangmanasync\app with all source java files:  
```  
A.java  
```  
```  
B.java  
```   
```   
Display.java  
```   
```   
Guesses.java   
```   
```   
HangManAsync.java  
```   
```   
KeyBoard.java  
```   
```   
OnBEventListener.java  
```   
```   
Status.java  
```   
```   
WordToGuess.java  
```  

- Then add  information about package in all java files:     
```
package com.hangmanasync.app;    
```   

- Then add following   below ```<artifactId>maven-jar-plugin</artifactId> ```line in pom.xml file n HangManAsync root directory:   
```   
<configuration>   
```   
```   
<archive>   
 ```   
 ```   
 <manifest>   
 ```   
 ```   
 <mainClass>com.hangmanasync.app.HangManAsync</mainClass>   
 ```   
```   
</manifest>   
```   
```   
</archive>   
```   
```   
</configuration>   
```   


- Then, build a project with a command from HangManAsync root directory:   
```   
$ mvn package   
```

- Then, run:  
```  
java -cp target/HangManAsync-1.0-SNAPSHOT.jar com.hangmanasync.app.HangManAsync   
```  

- Or, run command from target directory:
```   
$ java -jar HangManAsync-1.0-SNAPSHOT.jar
```


**Compiling with IDE**   

- Clone the repository
- Open the folder on IDE
- Compile project

You now have two options:   

- Execute on IDE   
- Execute via terminal (you can also build via terminal)    



## Java methods

Java OOP, Async callback


### Author

**Jacek Byzdra**  
*Software Developer  
jacek.jaroslaw.byzdra@gmail.com  
[Linkedin](https://www.linkedin.com/in/jacek-byzdra/) - [GitHub](https://github.com/jacekbwwa)*
