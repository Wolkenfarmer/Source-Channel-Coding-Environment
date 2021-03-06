# Welcome to the Coding Environment!
This program is designed to compare different codings in a simulated communication experiment. Currently only channel codings are included.

<br />

## Navigation
- Homepage (also start-up page)
  - Settings: Show the setup of the communication experiment (inspired by the Shannon Weaver Model of Communication). By clicking on an element you get to another page to set the experiment element which should be used in this place.
  - Result: The results of the last communication experiment will be displayed here.
  - Controls -> Run: Button to run the communication experiment with the current setup. The same setup will be run and evaluated 1000 times and then the average gets displayed in the result table.
- Settings pages: the sub-pages of the setup model on the home page.
  - Overview: Shows the location of the to be set experiment element.
  - Options: Displays the different already added options for e.g. the transcoder. By clicking an option its GUI will be loaded and shown in the information segment.
  - Information: Gives information about the currently selected option. Often further settings specific for this experiment element can be set here like the input in case of the input handler "User input". To set an option as the to be used experiment element for the next run of the program, "save & add" has to be pressed, which will update the color to green of the selected option in Options.

## Controls
- Esc -> Closes the program or returns to the home page.
- scroll -> Moves the content up and down, it it exceeds the screen's size.
- click -> Buttons and stuff.. self-explanatory.


## Software requirements
Uses Java 10 library. (soon to be updated)<br>
However, the releases package it's own Java hence for only running the program you don't need Java.<br>
For compiling on other devices the classpath probably has to be fixed.

## Further information
Further information can be extracted from the Javadoc comments - the whole code is documented.
Therefore, a code documentation website can be generated (also included in the releases).
<br /> 

## You run _Coding Environment_ at your own risk!
