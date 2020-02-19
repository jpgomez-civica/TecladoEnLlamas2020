# Teclado en llamas

**Índice**   
1. [Technologies](#techs)
2. [How it is structured](#structure)
3. [Installation](#installation)
4. [Challenge results](#results)
5. [Updates log](#log)
## Technologies <a name="techs"></a>
Web based project.
 - **Language:** PHP7 
 
## How it is structured <a name="structure"></a>
> This section will be updated as the project goes growing.
**[root]** : Contains the daily challenges folders and shared models, interfaces, traits...  
**[day_xx]** : Contains the Day XX challenge.  
**[traits]** : Shared traits. (***Ex**: File handler will be usea in almost all challenges*)  
**[models]** : *Future*. During project scalation models used in challenged will be moved to this folder in order to share them between differents folder in case that it is necesary.  
## Installation <a name="installation"></a>
We just need a web server as Nginx or Apache that use a ``PHP7`` or ``PHP7>`` version  
The easy way to install it, is download (depending on your OS) Xampp, Lampp, or Mamp server.  

By this way, the installer will ask you which components you want to install. We just need ``apache`` 
Once it is installed, unzip the proyect in ``htdocs`` folder. *Ex: htdocs/alexTroya/*  
Start the `apache` server.  
Accest to the project on (by default) `localhost:8000/alexTroya/dayXX`  

## Challenge Results.<a name="results"></a>
Results will be displayed directly in the browser by the `index.php` file.  
I won't be working on presentation and best practices for display content either on PHP, Ill just " `echo` "the result to screen.

## Updates log.<a name="log"></a>
19/02/20 - Uploaded **Day 01**.  
>I made up that Santa will reach the floor using the lift. Why? Because as all we know, there isn't chimney in all flats and because he's an old man and look for the exactly floor using the stairs can take too much time.  

**Models** used are inside the day folder. For the moment this model is used just in this challenge.  
**Traits**: `File` will be used in other challenges. It will be on root folder.  
