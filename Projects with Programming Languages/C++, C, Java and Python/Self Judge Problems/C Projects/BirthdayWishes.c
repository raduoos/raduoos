#include <stdio.h>


int main(){

    // Radu, an IT Student,
        // has been struggling to gain traction on his Instagram.
        // Despite his creative and engaging content, he consistently receives very few views and interactions.
        // This has led many to speculate that Radu has no friends in Spain.
        // Radu has almost no followers.

        // In a recent attempt to boost his online presence, Radu posted a story celebrating his birthday.
        // Out of the 31 people who viewed his story, only 6 wished him a happy birthday.
        // This dismal turnout further fueled the notion that Radu has no friends in Spain.

    // Write a Java program, that will calculate the percentage of people who wished him.

    int storyViewers;
    printf("Type the story viewers > ");
    scanf("%d", &storyViewers);

    int wishes;
    printf("Type the wishes count > ");
    scanf("%d", &wishes);

    float result = (float)wishes/storyViewers * 100;
    printf("%.2f\n", result);

    return 0;
}