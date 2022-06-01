<div align="center">

[![License](https://img.shields.io/github/license/skaspy/irrVerbPicker)](https://github.com/skaspy/irrVerbPicker/blob/main/LICENSE)
[![CodeSize](https://img.shields.io/github/languages/code-size/skaspy/irrVerbPicker)](https://github.com/skaspy/irrVerbPicker)
[![Java](https://img.shields.io/badge/language-Java%208-orange)](https://github.com/skaspy/irrVerbPicker/search?l=java)
[![Release](https://img.shields.io/github/v/release/skaspy/irrVerbPicker)](https://github.com/skaspy/irrVerbPicker/releases)

</div>


# IrrVerbPicker

**Source code and documentation are mostly in English. Since this project targets primarily English teachers and English learners in Germany some bits and pieces (e.g. error messages) are written in German.**

IrrVerbPicker is a program that picks random elements from a list of irregular English verbs. Learners of English as a foreign language and English teachers can use it to revise the long list of irregular verbs.
 
It is possible to choose the amount of verbs you want to pick and which grammatical form or combination of forms you want to display. The lists of irregular verbs match the Bavarian version of the Green Line series (G9 Lehrplan Plus/E1).

<p align="center">
<img height="400" src="https://github.com/skaspy/irrVerbPicker/blob/main/screenshot.png" alt="Screenshot 1"/>
</p>
 
## How to get a copy
### Prerequisites
* Have minimum [Java SE 8](https://www.java.com) installed on your OS.

### Getting started
1. Get a clone of this project:  `git clone git://github.com/skaspy/IrrVerbPicker.git`
2. Open it in your Java IDE.
3. Run the program within your IDE or create a *.jar* file to use it in any environment.
4. Once you have the *.jar* file you can:
  * run IrrVerbPicker via double click on the file
  * run IrrVerbPicker via command line: `java -jar IrrVerbPicker.jar`

## Customize verb lists
If you want to adjust the verb lists to your students' learning level, you can easily modify the *.txt* files. Just delete or add verbs. Be careful to stick to the correct layout pattern:
1. Only one verb per line
2. Seperate infinitive, simple past and past participle by a colon (e.g. go:went:gone)
3. Don't change the filenames of the *.txt* files!

## Contributing
Thank you for considering contributing to IrrVerbPicker. Just create a pull request or contact [me](mailto:bee.coding@gmx.de).

## License
[MIT License](https://opensource.org/licenses/mit-license.php)
