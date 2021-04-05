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
 * Each Entry obj consists of three different strings:
 * the infintive, the simple past and the past participle form of the verb.
 * 
 * @author Sabine Kasparek
 */
class Entry {
    
    private String simplePast;
    private String infinitive;
    private String pastParticiple;
    
    /**
     * Creates an Entry object that holds all three grammatical forms of an
     * irregular English verb.
     * @param i the infinitive form of the verb
     * @param s the simple past form of the verb
     * @param p the past participle form of the verb
     */
    public Entry(String i, String s, String p){
        infinitive = i;
        simplePast = s;
        pastParticiple = p;
    }
    
    /**
     * Returns the simple past form of the verb
     * @return the simple past form as string
     */
    public String getSimplePast() {
        return simplePast;
    }

    /**
     * @param simplePast to set the simple past form of the verb
     */
    public void setSimplePast(String simplePast) {
        this.simplePast = simplePast;
    }

    /**
     * Returns the infintitive form of the verb
     * @return the infintitive form as string
     */
    public String getInfinitive() {
        return infinitive;
    }

    /**
     * @param infinitive to set the infintitive form
     */
    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }
    
    /**
     * Returns the past participle form of the verb
     * @return the past participle form as string
     */
    public String getPastParticiple() {
        return pastParticiple;
    }
    
    /**
     * @param pastParticiple to set the past participle form
     */
    public void setPastParticiple(String pastParticiple) {
        this.pastParticiple = pastParticiple;
    }
    
}
