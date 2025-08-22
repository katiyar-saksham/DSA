<h2><a href="https://leetcode.com/problems/trapping-rain-water">Trapping Rain Water</a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr><p>Given <code>n</code> non-negative integers representing an elevation map where the width of each bar is <code>1</code>, compute how much water it can trap after raining.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img src="https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png" style="width: 412px; height: 161px;" />
<pre>
<strong>Input:</strong> height = [0,1,0,2,1,0,1,3,2,1,2,1]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> height = [4,2,0,3,2,5]
<strong>Output:</strong> 9
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == height.length</code></li>
	<li><code>1 &lt;= n &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>0 &lt;= height[i] &lt;= 10<sup>5</sup></code></li>
</ul>


### 🔎 Full Code Explanation (Without Code)

- Start mein, hum array ki length check karte hain — agar array empty hai to seedha 0 return kar dete hain, kyunki paani trap hi nahi ho sakta.  
- Hum do pointers lete hain — ek `left` jo array ke start se chalega, aur ek `right` jo end se chalega.  
- Do variables `leftMax` aur `rightMax` bhi lete hain, jo ab tak mile sabse bade wall ko track karte hain left aur right side se respectively.  
- Ab jab tak `left < right`, hum loop chalaate hain:  
  - Har step pe compare karte hain: left side ki building chhoti hai ya right side ki.  
  - Jo side chhoti hoti hai, usi side ke pointer ko move karte hain (kyunki wahi paani trap hone ki limit banata hai).  
  - Agar current height us side ke max se chhoti hai, to iska matlab wahan paani trap ho sakta hai — to hum `max - current height` kar ke paani add karte hain.  
  - Agar current height max se badi ya barabar hai, to max ko update kar dete hain.  
- Yeh process tab tak repeat hota hai jab tak left aur right pointers ek dusre ko cross nahi kar lete.  
- Loop ke baad, humne total jitna paani trap ho sakta tha, wo calculate kar liya hota hai — use return kar dete hain.

---

### 🧠 Core Idea in One Line:

Hum har position pe ye dekh rahe hain ki us point ke left aur right ka maximum wall kitna hai, aur uske basis par decide karte hain ki wahan paani trap ho sakta hai ya nahi.
