package com.sparrow.problem_;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 * @Author: Sparrow
 * @Description: LeetCode71
 * @DateTime: 2024/11/24 19:11
 **/
public class LeetCode71simplifyPath {
  public static String simplifyPath(String path) {
    String[] names = path.split("/");
    Deque<String> stack = new ArrayDeque<>();
    for (String name : names) {
      if ("..".equals(name)) {
        if (!stack.isEmpty()) {
          stack.pollLast(); //弹出栈顶的目录
        }
      } else if (name.length() > 0 && !".".equals(name)) {
        stack.offerLast(name);
      }
    }

    StringBuilder ans = new StringBuilder();
    if (stack.isEmpty()) {
      ans.append('/');
    } else {
      while (!stack.isEmpty()) {
        ans.append('/');
        ans.append(stack.pollFirst());
      }
    }
    return ans.toString();
  }

  public static String removeDuplicateLetters(String S) {
    char[] s = S.toCharArray();
    int[] left = new int[26];
    for (char c : s) {
      left[c - 'a']++;
    }
    StringBuilder ans = new StringBuilder(26);
    boolean[] inAns = new boolean[26];
    for (char c : s) {
      left[c - 'a']--;
      if (inAns[c - 'a']) {
        continue;
      }
      while (!(ans.length() == 0) && c < ans.charAt(ans.length() - 1) && left[ans.charAt(ans.length() - 1) - 'a'] > 0) {
        inAns[ans.charAt(ans.length() - 1) - 'a'] = false; //标记x不在ans中
        ans.deleteCharAt(ans.length() - 1);
      }
      ans.append(c);
      inAns[c - 'a'] = true;
    }
    return ans.toString();
  }

  public static void main(String[] args) {
    simplifyPath("/home/user/Documents/../Pictures");
    removeDuplicateLetters("cbacdcbc");
  }
}
