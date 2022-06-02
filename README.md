<div align="center">

[![License](https://img.shields.io/github/license/skaspy/irrVerbPicker)](https://github.com/skaspy/irrVerbPicker/blob/main/LICENSE)
[![CodeSize](https://img.shields.io/github/languages/code-size/skaspy/irrVerbPicker)](https://github.com/skaspy/irrVerbPicker)
[![Java](https://img.shields.io/badge/language-Java%208-orange)](https://github.com/skaspy/irrVerbPicker/search?l=java)
[![Release](https://img.shields.io/github/v/release/skaspy/irrVerbPicker)](https://github.com/skaspy/irrVerbPicker/releases)

</div>


# IrrVerbPicker

**Source code and documentation are mostly in English. Since this project targets primarily English teachers and English learners in Bavaria some bits and pieces are written in German.**

IrrVerbPicker is a program that picks random elements from a list of irregular English verbs. Learners of English as a foreign language and English teachers can use it to revise the long list of irregular verbs.
 
It is possible to choose the amount of verbs you want to pick and which grammatical form or combination of forms you want to display. The lists of irregular verbs match the Bavarian version of the Green Line series (G9 Lehrplan Plus/E1).

<p align="center">
<img height="400" src="https://github.com/skaspy/irrVerbPicker/blob/main/screenshot.png" alt="Screenshot 1"/>
</p>
 
## How to get a copy
### Prerequisites
* Have minimum [Java SE 8](https://www.java.com) installed on your OS.

### Getting started as a user
1. Download the [release files](https://github.com/skaspy/irrVerbPicker/releases). (You don't need the source-code files.)
2. Make sure you have [Java Runtime Environment](https://java.com/download) (JRE) installed on your computer.
3. Now you can either:
  * run IrrVerbPicker via double click on the *.jar* file or
  * run IrrVerbPicker via command line: `java -jar IrrVerbPicker.jar`

### Getting started as a developer
1. Use [Git](https://git-scm.com) to get a clone of this project:  `git clone git://github.com/skaspy/IrrVerbPicker.git`
2. Open or import it with your Java IDE (e.g. [NetBeans](https://netbeans.apache.org/))
3. Run the program within your IDE or build a *.jar* file to use it in any environment.

## Customize verb lists
If you want to adjust the verb lists to your students' learning level or a different English class book, you can easily modify the *.txt* files. Just delete or add verbs. Be careful to stick to the correct layout pattern:
1. Only one verb per line!
2. No blank lines in between!
3. Seperate infinitive, simple past and past participle by a colon (e.g. *go:went:gone*)!
4. Don't change the filenames of the *.txt* files!

## Contributing
Thank you for considering contributing to IrrVerbPicker. Just create a pull request or [contact](mailto:bee.coding@gmx.de) me.

## License
[MIT License](https://opensource.org/licenses/mit-license.php)
