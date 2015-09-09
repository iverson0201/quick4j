package com.eliteams.quick4j.items.spring01;

import java.util.List;

/**
 * Description of this file.
 * Created by xujw on 2015/9/9.
 */
public class SequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private int counter;

    private List<Object> suffixes;


    private Object[] suffss;

    public SequenceGenerator() {
    }

    public SequenceGenerator(String prefix, String suffix, int initial) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.initial = initial;
    }

    public void setSuffss(Object[] suffss) {
        this.suffss = suffss;
    }

    public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(prefix);
        buffer.append(initial + counter++);
        buffer.append(suffix);
        return buffer.toString();
    }

    public synchronized String getSequence2() {
        StringBuffer buffer = new StringBuffer();
        for (Object suffix : suffixes) {
            buffer.append("-");
            buffer.append(suffix);
        }
        return buffer.toString();
    }

    public synchronized String getSequence3() {
        StringBuffer buffer = new StringBuffer();
        for (Object suff : suffss) {
            buffer.append("-");
            buffer.append(suff);
        }
        return buffer.toString();
    }
}
