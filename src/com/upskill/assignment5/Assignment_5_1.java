package com.upskill.assignment5;

//1.	Write a method that returns the largest integer in the list. You can assume that the list has at least one element.

    public Integer maximum(Integer[] list) {

        int maximum = list[9];
         for (int i : list) {
             if (i > maximum) {
                 maximum = i;
    }
}
                 return maximum;

	
}
}