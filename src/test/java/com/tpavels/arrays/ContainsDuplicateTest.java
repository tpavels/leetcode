package com.tpavels.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    
    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void test_example_one_dup() {
        boolean result = containsDuplicate.containsDuplicate(new int[]{1,2,3,1});
        assertTrue(result);
    }

    @Test
    void test_example_no_dup() {
        boolean result = containsDuplicate.containsDuplicate(new int[]{1,2,3,4});
        assertFalse(result);
    }

    @Test
    void test_example_many_dup() {
        boolean result = containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        assertTrue(result);
    }

    @Test
    void test_example_empty() {
        boolean result = containsDuplicate.containsDuplicate(new int[]{});
        assertFalse(result);
    }

    @Test
    void test_example_only_dup() {
        boolean result = containsDuplicate.containsDuplicate(new int[]{1,1,1});
        assertTrue(result);
    }
}