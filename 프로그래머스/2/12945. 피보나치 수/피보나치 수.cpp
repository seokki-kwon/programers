#include <string>
#include <vector>

using namespace std;

int solution(int n) {    
    int p1 = 0, p2 = 1;
    for (int i = 1; i < n; i++) {
        int fibo = (p1 + p2) % 1234567;
        p1 = p2;
        p2 = fibo;
    }
        
    return p2;
}