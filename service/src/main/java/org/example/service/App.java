package org.example.service;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class App {
    public App(String name) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(name));
    }
}
