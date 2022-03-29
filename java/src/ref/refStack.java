package ref;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class refStack {
    public static void main(String[] args){
        Stack stack = new Stack();
        System.out.println(stack.empty());

        stack.push("abc");
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.search("abc"));
        stack.push("def");
        System.out.println(stack.search("def"));

        Deque<Integer> st = new ArrayDeque<>();
        st.add(4);
        System.out.println(st.peek());
        List ls = new ArrayList();
        ls.add(5);
        ls.add(6);
        ls.add(7);
        st.addAll(ls);
        System.out.println(st);
        Iterator<?> it = st.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
