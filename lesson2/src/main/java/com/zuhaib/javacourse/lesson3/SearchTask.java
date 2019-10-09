package com.zuhaib.javacourse.lesson3;

import java.util.concurrent.Callable;

class SearchTask implements Callable<Integer> {
    private int localCounter = 0;
    private int start; // start index of search
    private int end;
    private List<String> words;
    private String token;

    public SearchTask(int start, int end, List<String> words, String token) {
        this.start = start;
        this.end = end;
        this.words = words;
        this.token = token;
    }

    public Integer call() {
        for(int i = start; i < end; i++) {
            if(words.get(i).equals(token)) localCounter++;
        }
        return localCounter;
    }
}



