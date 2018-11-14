# Algorithm
## Consist of some basic algorithms implemented in Java
- Quick Find
  (Interpretation:- Let p and q be two elements of array, they are connected iff they have same ID's
  
  Find:- Check if p and q have same ID
         
         id[p]==id[q], connected, or
         id[p]!=id[q], not connected
  
  Union:- To merge components containing p and q, change all entries whose ID equals id[p] into id[q])

- Quick Union 
  (Interpretation:- Let p and q be two elements of array, they are connected via link such that q is the root element of p
  
  Find:- Check if p and q have the same root or not
  
         root(p)==root(q), connected, or
         root(p)!=root(q), not connected
         
  Union:- To merge components containing p and q, set the id of p's root to the id of q's root)

- Weighted Quick Union
  (Interpretation:- Same as Quick Union except a size array sz[] is used which holds the number of elements in a tree
  
  Find:- Same as Qucick Union
  
  Union:-Modify  Quick Union to:-
  
  1.)Link Root of a smaller tree to root of larger tree making it a child of larger tree.
  2.)Update the sz[] array to total no of elements now in a tree)
