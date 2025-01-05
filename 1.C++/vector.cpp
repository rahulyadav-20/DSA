#include <vector>
#include <iostream>
#include<algorithm>

using namespace std;

int main(){

    //Vector Declaration and Initialization
    vector<int> vec;              // Empty vector of ints
    vector<int> vec(10);          // Vector with 10 default-initialized elements
    vector<int> vec(10, 5);       // Vector with 10 elements, each initialized to 5
    vector<int> vec = {1, 2, 3};  // Vector initialized with list

    cout << "size: " << vec.size() << endl;  // Returns the number of elements in the vector
    cout << "capacity: " << vec.capacity() << endl; //Returns the size of the storage space currently allocated to the vector
    cout<< "Is Empty:: " << vec.empty() << endl; //Returns weather the vector is empty or not

    //Accessing the element
    int val = vec[2];          // Access element at index 2
    int val = vec.at(2);       // Safe access with bounds checking
    int first = vec.front();   // First element
    int last = vec.back();     // Last element
    int* ptr = vec.data();     // Pointer to the data array

    vec.assign(5, 10);         // Assigns 5 elements with value 10
    vec.push_back(20);         // Adds 20 to the end of the vector
    vec.pop_back();            // Removes the last element
    vec.insert(vec.begin() + 2, 15); // Inserts 15 at index 2
    vec.erase(vec.begin() + 1);      // Removes element at index 1
    vec.clear();               // Removes all elements
    vec.emplace(vec.begin(), 1, 2);   // Constructs pair (1, 2) at the beginning
    vec.emplace_back(3, 4);    // Constructs pair (3, 4) at the end

    for(int i=0; i<vec.size(); i++){  //Iterating using index
        cout << vec[i] << " ";
    }
    cout << endl;
 
    for(auto i : vec){  //Range based for loop
        cout << i << " ";
    }
    cout << endl;

    //Iterators
    auto it = vec.begin();          // Iterator to the first element
    auto it_end = vec.end();        // Iterator to the element following the last element
    auto rit = vec.rbegin();        // Reverse iterator to the first element of the reversed vector
    auto rit_end = vec.rend();      // Reverse iterator to the element following the last element of the reversed vector
    auto cit = vec.cbegin();        // Constant iterator to the first element
    auto cit_end = vec.cend();      // Constant iterator to the element following the last element

    // Using begin() and end()
    cout << "Normal iteration: ";
    for (auto it = vec.begin(); it != vec.end(); ++it) {  
        cout << *it << " ";  // Output: 1 2 3 4 5
    }
    cout << endl;

    // Using rbegin() and rend()
    cout << "Reverse iteration: ";
    for (auto rit = vec.rbegin(); rit != vec.rend(); ++rit) {
        cout << *rit << " ";  // Output: 5 4 3 2 1
    }
    cout << endl;

    sort(vec.begin(), vec.end()); // Sort in ascending order
    sort(vec.begin(), vec.end(), greater<int>()); // Sort in descending order

    //Partially sorts the vector such that the element at the nth position is the same as if the entire vector were sorted.
    nth_element(vec.begin(), vec.begin() + 2, vec.end()); // Partially sort so that the 3rd element is the correct element in a sorted vector

    reverse(vec.begin(), vec.end());  // Reverse the vector

    auto it = find(vec.begin(), vec.end(), 3);
    if (it != vec.end()) cout << "Found!" << endl;

    int count = count(vec.begin(), vec.end(), 2); //Counts occurrences of an element.

    int sum = accumulate(vec.begin(), vec.end(), 0); //Computes the sum of all elements.

    vec.erase(unique(vec.begin(), vec.end()), vec.end());  // Remove duplicates

    copy(vec1.begin(), vec1.end(), vec2.begin()); //Copies elements from one container to another.

    vec.erase(remove(vec.begin(), vec.end(), 2), vec.end());  // Remove all 2's

    auto min_it = min_element(vec.begin(), vec.end());  //Returns an iterator to the smallest element.
    cout << "Min element: " << *min_it << endl;

    auto max_it = max_element(vec.begin(), vec.end());   //Returns an iterator to the largest element.
    cout << "Max element: " << *max_it << endl;

    //Checks if a given element exists in the sorted vector
    bool found = binary_search(vec.begin(), vec.end(), 3);  // Returns true if found

    auto it = lower_bound(vec.begin(), vec.end(), 3); //Finds the first element that is not less than the given value
    if (it != vec.end()) cout << "First element >= 3: " << *it << endl;

    auto it = upper_bound(vec.begin(), vec.end(), 3);  //Finds the first element that is greater than the given value
    if (it != vec.end()) cout << "First element > 3: " << *it << endl;


    bool areEqual = equal(vec1.begin(), vec1.end(), vec2.begin()); //Compares two ranges for equality

    fill(vec.begin(), vec.end(), 0);  // Fills all elements with 0

    //Removes elements based on a condition.
    vec.erase(remove_if(vec.begin(), vec.end(), [](int x) { return x % 2 == 0; }), vec.end()); // Removes all even elements

    set_union(vec1.begin(), vec1.end(), vec2.begin(), vec2.end(), result.begin()); //Computes the union of two sorted ranges.
    
    set_intersection(vec1.begin(), vec1.end(), vec2.begin(), vec2.end(), result.begin()); //Computes the intersection of two sorted ranges

    set_difference(vec1.begin(), vec1.end(), vec2.begin(), vec2.end(), result.begin()); //Computes the difference of two sorted ranges (elements in the first vector that aren't in the second).

    next_permutation(vec.begin(), vec.end()) //Transforms the range into the nest permutation from the set of all permutations that are lexicographically ordered

    //Applies a function to a range and stores the result in another container.
    transform(vec.begin(), vec.end(), vec.begin(), [](int x) { return x * 2; }); // Doubles all elements in vec

     // Add 10 to each element using a lambda
    for_each(vec.begin(), vec.end(), [](int& x) {
        x += 10;
    });

    cout << vec.max_size() <<endl; //Return the maximun number of elements that the vector can hold
    cout << "Size after resize: " << vec.size() << endl; //Resizes the vector to contain n elements.
    
    //Requests to reduce the capacity of the vector to fit its size.
    cout << "Capacity before shrink_to_fit: " << vec.capacity() << endl;
    vec.shrink_to_fit();
    cout << "Capacity after shrink_to_fit: " << vec.capacity() << endl;

}

