# FindLoopBeginning
Check if a singly linked list has a loop, if so, return the beginning node of the loop

//Given a circular linked list, returns the node at the beginning of the loop

//check if there is a loop, p1 move 1 step, p2 move 2 steps every time, remember error checking if p2==null or p2.next==null

//when they collide, still two pointers, one starts from the head, the other from the collision point

//they will meet at the beginning of the loop, which is the Node we want to return
	
