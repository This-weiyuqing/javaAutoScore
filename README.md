# javaAutoScore
FirstJavaApp

  这是我个人第一次做出的个人程序，背景为新冠肺炎导致不能返校进行期末考试，所以java考试转为了大作业的形式，从一定程度上降低了作业的难度，更重要的是这种模式可以让我们真正去学习java而不是继续应试教育，应试教育是很可悲的，大家都懂。
  下面复制粘贴一下我的实验报告中的部分内容。
  本程序需要实现用户登入，自动计时，自动读题，自动判题并且将用户成绩信息存盘以供阅读的功能。而为了与用户交互，需要设计用户交互界面，由于程序的特殊性，UI可以直接使用java编写。
  而在本次设计中，我把它分为了两部分，登录界面以及做题界面，仔细地又分了一下，分成了前端和后端，通过按钮监听建立起之间的联系。
  不过话说回来，现在睡有会用java来编写前端UI呢？
  再粘贴一下我个人的遇到的一些问题以及解决方案吧。
  在本次编程过程中，我遇到了如下问题：

1.	文件读取问题
问题描述：		读取问题（答案）时，自动读取下一个文件
解决办法：		使用了File数组，读取问题存储文件夹将问题文件存储在File数组中，通过读取问题的方法的参数表传递需要读取第几题，通过数组读取文件然后返回文件位置信息，在通过readFile方法读取文件内容为String str，然后return str。

2.	按钮监听问题
问题描述：		点击按钮后，显示下一题，但是问题与答案在文件内记录的仍为旧题号
解决办法：		在主方法而不是actionPerFormed方法中int了whatQuestion，在actionPerFormed中进行whatQuestion=whatQuestion++计算。

3.	程序关闭问题
问题描述：		在最初一版可运行程序中，程序在运行完后，userIn与mainGUI创建的窗体都不会自动关闭
解决办法：		对于userIn窗体，在userIn窗体的login按钮监听中，在密码通过部分新建mainGUI实例前加上了dispose（）;这行代码，用来关闭以打开的窗体：userIn窗口。
            对于mainGUI界面，由于这个界面需要关闭的时候一定是程序运行完毕，得分信息也已经输入到文件夹，即为程序已经可以关闭。综上，在ABCD按钮的actionPerFormed中添加了if判断，if whatQuestion< question’s number，进行正常操作显示下一题等else {scoreToTxt; System.exit(0);} 。
这里值得一提的是，由于scoreTxt方法中使用了java.io包里的方法，所以else里会用try{} catch{} to printStackTrace，而且mainGUI方法因为内部使用了scoreTxt方法，在方法定义语句中也需要throws IoException。

  当然这次的编程对我自己也是有很大的提升的：
  
  a)	不要把问题想的太麻烦。
编程中出现的一些小问题，多半是逻辑问题，而我们会先去修改一个点，但是由于程序逻辑性过强，有的时候修改这一个点就需要修改接近一半篇幅的程序，这个时候我们要想一想，是不是最开始的方向就错了，出错的地方有没有可能是非直接的位置。

b)	不要太过于相信直觉。
在编程的时候，当一个功能出现问题的时候，我直觉性的会觉得某个地方出了问题，而这种直觉指向的一般都是问题直接的位置，但是事实证明，更多的时候问题并不出在直接位置。同样的在解决问题的时候，直觉会告诉我们这样做。但是直觉并不总是正确的，很多的时候，另一种方法会轻而易举的解决问题，直觉却把我们带进了死胡同。

c)	不要钻牛角尖
就像我在前两个问题中说的，我们会相信直觉，而且会死死地抓住自己出现的思路不放，即使它解决不出问题。当我们沿着一个思路一直解决不了问题，多半不是方法出了问题，而是最开始的思路就不对，倒不如记录下来这种思路，去想想别的可能。

d)	出现问题的时候要善用工具
人类区别于动物的很重要一点就是，我们更会合作，更会实用工具。而在互联网时代的今天，我们可以轻而易举获取的知识达到了恐怖的程度，当遇到问题的时候，不妨打开搜索引擎以及软件/支持包自带的帮助文档，去搜索我们的问题，这可以解决我们编程过程中几乎100%的问题。
而在科技如此发达的今天，IDEA的各种插件，市面上的各种开源软件，都会给我们的编程带来前所未有的流畅感，轻松感，以及舒适度，可以说只有善于使用工具，我们才会成为更好的计算机行业从业者，成为更好的人。

e)	规范的重要性
编程，是需要规范的，而这个规范，落实到个人身上是没有意义的，它是相对于整体说的，我们大家，在相互之间的合作，分享的时候，规范会为我们解决很多问题。当我们问起别人自己代码的问题的时候，规范的代码，和不规范的代码，是欣赏与歧视的区别。

  总结的来说尽管过程十分曲折，而且结果可能也并不是那么令我满意，但是内心还是很欣喜的，毕竟也是第一次做出来一个属于自己的，完整的，可以自豪的添加上自己的版权声明的 程序 。
  希望未来的路能越走越好吧。
  魏遇卿。
