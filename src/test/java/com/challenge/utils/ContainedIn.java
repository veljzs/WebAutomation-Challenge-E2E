package com.challenge.utils;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.util.List;

public class ContainedIn extends TypeSafeMatcher<List<String>> {
    private final List<String> expectedItems;

    public ContainedIn(List<String> expectedItems) {
        this.expectedItems = expectedItems;
    }

    @Override
    protected boolean matchesSafely(List<String> actualItems) {
        return actualItems.containsAll(expectedItems);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("expected items to be contained in the actual items");
    }

    public static ContainedIn containedIn(List<String> expectedItems) {
        return new ContainedIn(expectedItems);
    }
}
