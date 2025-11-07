package com.example.task;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void shouldNormalizeAndRemoveDuplicates() {
        List<String> input = Arrays.asList(" Apple ", "banana", "BANANA", "apple", null, " ");
        List<String> result = StringUtil.normalizeStrings(input);

        assertEquals(Arrays.asList("apple", "banana"), result);
    }

    @Test
    public void shouldHandleNullOrEmptyList() {
        assertEquals(Collections.emptyList(), StringUtil.normalizeStrings(null));
        assertEquals(Collections.emptyList(), StringUtil.normalizeStrings(Collections.emptyList()));
    }

    @Test
    public void shouldPreserveOrder() {
        List<String> input = Arrays.asList("  Cat", "dog", "DOG", "cat", "mouse ");
        List<String> result = StringUtil.normalizeStrings(input);
        assertEquals(Arrays.asList("cat", "dog", "mouse"), result);
    }
}
