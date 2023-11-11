#include <iostream>
using namespace std;

int main(){
    int storyViewers;
    cout << "Type the story viewers: ";
    cin >> storyViewers;

    int wishes;
    cout << "Type the wishes he received: ";
    cin >> wishes;

    double result = (double)wishes / storyViewers * 100;

    cout << "The result is: " << result << endl;

    return 0;
}
