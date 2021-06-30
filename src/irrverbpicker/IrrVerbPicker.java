/*
 * MIT License
 * 
 * Copyright (c) 2021 Sabine Kasparek
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */
package irrverbpicker;


/**
 * This project enables you to pick a number of random entries from a list
 * of irregular English verbs and to choose which grammatical form (infinitive,
 * simple past or past participle) you want to display.
 * 
 * @author Sabine Kasparek
 * @since 10/2020
 * @version 1.0
 */
public class IrrVerbPicker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WordPicker wp = new WordPicker();
        wp.loadFile();
        GUI gui = new GUI(wp);
    }
}
