package com.zuhaib.javacourse.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.zuhaib.javacourse.lesson3.SearchTask;

public class main {
    // meanwhile in main :)

    List<String> words = new ArrayList<String>();
// populate words
// let's assume you have 30000 words

    // create tasks
    List<Callable> tasks = new ArrayList<Callable>();
    tasks.add(new SearchTask(0, 10000, words, "John"));
    tasks.add(new SearchTask(10000, 20000, words, "John"));
    tasks.add(new SearchTask(20000, 30000, words, "John"));

    // create thread pool and start tasks
    ExecutorService exec = Executors.newFixedThreadPool(3);
    List<Future> results = exec.invokeAll(tasks);

    // wait for tasks to finish and collect results
    int counter = 0;
        for(Future f: results) {
        counter += f.get();
    }

}
