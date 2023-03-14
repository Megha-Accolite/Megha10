package com.example.au_demo_live.mockito.examples;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class mockitoExamples {
    @Test
    public void testLinkedListGetElement()
    {
        final var list= Mockito.mock(java.util.LinkedList.class);
        when(list.size()).thenReturn(10);
        //assertEquals(1,list.size());//error
        assertEquals(10,list.size());
    }
    @Test
    public void testLinkedListGetElement_ThrowException()
    {
        final var list= Mockito.mock(java.util.LinkedList.class);
        when(list.add("John")).thenThrow(new RuntimeException("You cannot insert data in this list"));
        //assertThrows(RuntimeException.class,()->list.add("Sam")); //error
        assertThrows(RuntimeException.class,()->list.add("John"));
    }

}












