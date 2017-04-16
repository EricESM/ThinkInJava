# ThinkInJava
Self learning section

Java: 
	Notes - From page 15 to 60: 

		Polymorphism
		多形性

		Parameterized

	
		Introduction to Objects 	- 		page 15:
			These characteristics represent a pure approach to object-oriented programming:
			通过这些特征,我们可以理解"纯粹"的面向对象程序设计方法是什么样的:
				1.	Everything is an object.
					所有东西都是对象
				2.	A program is a bunch of objects telling each other waht to do by sending messages.
					程序是一大堆对象的组合
				3.	Each object has its own memory made up of other objects.
					每个对象都有自己的存储空间,可容纳其他对象
				4.	Every object has a type.
					每个对象都有一种类型
				5.	All objects of a particular type can receive the same messages.
					同一类所有对象都能接受相同的消息


			Inheritance:
				When you inherit from an existing type, you create a new type. 
				This new type contains not only all the members of the existing 
				type(although the privete ones are hidden away and inaccessible), 
				but more importantly it duplicates the interface of the base class.
				That is, all the message you can send to objects of the base class 
				you can also send to objects of the derived class.
				使用继承时,相当于创建了一个新类.这个新类不仅包含了所有类型的所有成员(尽管private
				成员被隐藏以来,且不能访问),但更重要的是,它复制了基础类的接口.也就是说,
				可向基础类的对象发送的所有消息亦可原样发给衍生类的对象

			Upcasting:
				The name cast is used in the sense of casting into a mold and 
				the up comes from the way the inheritance diagram is typically 
				arranged, with the base type at the top and the derived classed 
				fanning out downward. Thus, casting to a base type is moving up 
				the inheritance diagram: "upcasting."
				其中,"CAST"(造型)是指根据一个现成的模型创建;而"UP"(向上)表明继承的方向是
				从"上面"来的--即基础类位于顶部,而衍生类在下方展开. 所以,根据基础类进行造型
				就是一个从上面继承的过程,即"Upcasting".

			Oject creation & lifetime:

				Stack: This places a priority on the speed of storage allocation
				and release, and this control can be very valuable in some 
				situations. However, you savrifice flexibity bececasue you must 
				know the exact quantity, lifetime, and type of objects while 
				your're writing the program.If you are trying to solve a more 
				general problem such as computer-adided design, warehouse management, 
				or air-traffic control, this is too restrictive.
				为获得最快的运行速度,存储以及存在时间可在编写程序时决定, 只需要将对象放置在堆栈或者
				静态储存区域即可. 这样便为存储空间的分配和释放提供了一个优先级. 某些情况下,这种优先
				级的控制是非常有价值的.然而,我们也牺牲了灵活性,因为在编写程序时,必须知道对象的准确的
				数量,存在时间,以及类型.如果要解决的是一个较常规的问题,如计算机辅助设计,仓库管理或者
				空中交通控制,这一方法就显得太局限了.

				Second approach is to create objects dynamically in a pool of memory 
				called the heap.In this approach, you don't know until run time how 
				many objects you need, what their lifetime is, or what their exact 
				type is.becuase the storage is managed dynamically, at run time, the 
				amount of time required to allocate storage on the heap can be noticeably 
				longer than the time to create storage on the stack.
				第二个方法是在一个内存池中动态创建对象,该内存池也叫"堆".若采用这种方式,除非进入运行期,
				否则根本不知道到需要多少个对象,也不知道他们的存在时间有多长,已经准确的类型是什么.
				由于存储空间的管理是运行时间动态进行的,所以在内存堆分配存储空间的时候要比堆栈要长的多.
				总结就是要么牺牲灵活性换取时间,反而一样.

			Exception:
				
				Execption handling wirtes error handling directly into programming 
				language and sometimes even the operating system. An exception is 
				an object that is "thrown" from the site of the error and can be 
				"caught" by an appropriate exception handler designed to handle 
				that particular type of error.
				"违例控制"将错误控制方案内置到程序设计语言中,有时甚至内建到系统内. 这里的"违例"
				(Exception)属于一个特殊的对象,他会从产生错误的地方"扔"或者"丢"出来. 随后,这个
				违例会被设计用于控制特定类型错误的"违例控制器"捕获.

			Concurrent programming:

				Thread
				线程

			
			Java and the Internet:
				
				Although Java is very useful for solving traditional standalone
				programming problems, it is also important becasue it solves 
				programming problems for the World Wide Web.
				Java除了可解决传统的程序设计问题以外,还能解World Wide Web　万维网上的编程问题．

				What is the Web?
					
					We must need to understand clinet/server systems, another aspect 
					of computing that's full of confusing issues.
					我们必须先理解客户机/服务器系统的概念,这是充斥着许多令人迷惑的问题的又一个计算领域.

					1. Clinent/server computing
						The software that distributes the information, and the machine(s) 
						where the information and software reside are called "the server." 
						The software that resides on the consumer machine, communicates with 
						the server, feches the information, processes it, and then displays 
						it on the consumer machine is called the clinet.
						将各种元素集中到一起，信息仓库，用于投递信息的软件以及信息及软件所在的那台机器，
						他们联合起来便叫作＂服务器＂（server).　二队那些驻留在远程机器上的软件，它们
						需要与服务器通信，取回信息，进行适当的处理，然后在远程机器上显示出来，这些叫作
						＂客户＂(Client)

					2. The Web as a giant server
						The Web is actually one giant clint/server system. It's a bit 
						worse than that, since you have all the servers and client
						coexisting on a single network at once.
						client ---- messages ----> server (---compute the message---) ----- result messages -----> client

					3. Client-side programming
						Common Gateway Interface (CGI)
						many powerful Web sites today are built strictly on CGI, and you 
						can in fact do nearly anything with CGI. however, web sites built
						on CGI programs can rapidly become overly complicated to maintain,
						and there is also the problem of reponse time. TO SOLVE it we need 
						Clint-side programming.

						Plug-ins

						Scripting languages

						Java
						if a scripting language can solve 80 percent of the clint-side
						programming problems, what about the other percent -- the "really 
						hard stuff" Java is a popular solution for this.
						via the applet and with Java Web Start

						Security
						Java run in the sandbox. any memory out of the sandbox woudln't 
						allow to access.


			 分析和设计
			 	
				 　不要迷失
				 		在整个开发过程中，最重要的事情就是：不要将自己迷失！但事实上这种事情很容易发生。大多数方法都设计用来解决最大范围内的问题。当然，也存在一些特别困难的项目，需要作者付出更为艰辛的努力，或者付出更大的代价。但是，大多数项目都是比较“常规”的，所以一般都能作出成功的分析与设计，而且只需用到推荐的一小部分方法。但无论多么有限，某些形式的处理总是有益的，这可使整个项目的开发更加容易，总比直接了当开始编码好！
						也就是说，假如你正在考察一种特殊的方法，其中包含了大量细节，并推荐了许多步骤和文档，那么仍然很难正确判断自己该在何时停止。时刻提醒自己注意以下几个问题：
						(1) 对象是什么？（怎样将自己的项目分割成一系列单独的组件？）
						(2) 它们的接口是什么？（需要将什么消息发给每一个对象？）
						在确定了对象和它们的接口后，便可着手编写一个程序。出于对多方面原因的考虑，可能还需要比这更多的说明及文档，但要求掌握的资料绝对不能比这还少。
						整个过程可划分为四个阶段，阶段0刚刚开始采用某些形式的结构。
						1.12.2 阶段0：拟出一个计划
						第一步是决定在后面的过程中采取哪些步骤。这听起来似乎很简单（事实上，我们这儿说的一切都似乎很简单），但很常见的一种情况是：有些人甚至没有进入阶段1，便忙忙慌慌地开始编写代码。如果你的计划本来就是“直接开始开始编码”，那样做当然也无可非议（若对自己要解决的问题已有很透彻的理解，便可考虑那样做）。但最低程度也应同意自己该有个计划。
						在这个阶段，可能要决定一些必要的附加处理结构。但非常不幸，有些程序员写程序时喜欢随心所欲，他们认为“该完成的时候自然会完成”。这样做刚开始可能不会有什么问题，但我觉得假如能在整个过程中设置几个标志，或者“路标”，将更有益于你集中注意力。这恐怕比单纯地为了“完成工作”而工作好得多。至少，在达到了一个又一个的目标，经过了一个接一个的路标以后，可对自己的进度有清晰的把握，干劲也会相应地提高，不会产生“路遥漫漫无期”的感觉。
						座我刚开始学习故事结构起（我想有一天能写本小说出来），就一直坚持这种做法，感觉就象简单地让文字“流”到纸上。在我写与计算机有关的东西时，发现结构要比小说简单得多，所以不需要考虑太多这方面的问题。但我仍然制订了整个写作的结构，使自己对要写什么做到心中有数。因此，即使你的计划就是直接开始写程序，仍然需要经历以下的阶段，同时向自己提出一些特定的问题。
						1.12.3 阶段1：要制作什么？ 在上一代程序设计中（即“过程化或程序化设计”），这个阶段称为“建立需求分析和系统规格”。当然，那些操作今天已经不再需要了，或者至少改换了形式。大量令人头痛的文档资料已成为历史。但当时的初衷是好的。需求分析的意思是“建立一系列规则，根据它判断任务什么时候完成，以及客户怎样才能满意”。系统规格则表示“这里是一些具体的说明，让你知道程序需要做什么（而不是怎样做）才能满足要求”。需求分析实际就是你和客户之间的一份合约（即使客户就在本公司内部工作，或者是其他对象及系统）。系统规格是对所面临问题的最高级别的一种揭示，我们依据它判断任务是否完成，以及需要花多长的时间。由于这些都需要取得参与者的一致同意，所以我建议尽可能地简化它们——最好采用列表和基本图表的形式——以节省时间。可能还会面临另一些限制，需要把它们扩充成为更大的文档。
						我们特别要注意将重点放在这一阶段的核心问题上，不要纠缠于细枝末节。这个核心问题就是：决定采用什么系统。对这个问题，最有价值的工具就是一个名为“使用条件”的集合。对那些采用“假如……，系统该怎样做？”形式的问题，这便是最有说服力的回答。例如，“假如客户需要提取一张现金支票，但当时又没有这么多的现金储备，那么自动取款机该怎样反应？”对这个问题，“使用条件”可以指示自动取款机在那种“条件”下的正确操作。
						应尽可能总结出自己系统的一套完整的“使用条件”或者“应用场合”。一旦完成这个工作，就相当于摸清了想让系统完成的核心任务。由于将重点放在“使用条件”上，一个很好的效果就是它们总能让你放精力放在最关键的东西上，并防止自己分心于对完成任务关系不大的其他事情上面。也就是说，只要掌握了一套完整的“使用条件”，就可以对自己的系统作出清晰的描述，并转移到下一个阶段。在这一阶段，也有可能无法完全掌握系统日后的各种应用场合，但这也没有关系。只要肯花时间，所有问题都会自然而然暴露出来。不要过份在意系统规格的“完美”，否则也容易产生挫败感和焦燥情绪。
						在这一阶段，最好用几个简单的段落对自己的系统作出描述，然后围绕它们再进行扩充，添加一些“名词”和“动词”。“名词”自然成为对象，而“动词”自然成为要整合到对象接口中的“方法”。只要亲自试着做一做，就会发现这是多么有用的一个工具；有些时候，它能帮助你完成绝大多数的工作。
						尽管仍处在初级阶段，但这时的一些日程安排也可能会非常管用。我们现在对自己要构建的东西应该有了一个较全面的认识，所以可能已经感觉到了它大概会花多长的时间来完成。此时要考虑多方面的因素：如果估计出一个较长的日程，那么公司也许决定不再继续下去；或者一名主管已经估算出了这个项目要花多长的时间，并会试着影响你的估计。但无论如何，最好从一开始就草拟出一份“诚实”的时间表，以后再进行一些暂时难以作出的决策。目前有许多技术可帮助我们计算出准确的日程安排（就象那些预测股票市场起落的技术），但通常最好的方法还是依赖自己的经验和直觉（不要忘记，直觉也要建立在经验上）。感觉一下大概需要花多长的时间，然后将这个时间加倍，再加上10％。你的感觉可能是正确的；“也许”能在那个时间里完成。但“加倍”使那个时间更加充裕，“10％”的时间则用于进行最后的推敲和深化。但同时也要对此向上级主管作出适当的解释，无论对方有什么抱怨和修改，只要明确地告诉他们：这样的一个日程安排，只是我的一个估计！
						1.12.4 阶段2：如何构建？
						在这一阶段，必须拿出一套设计方案，并解释其中包含的各类对象在外观上是什么样子，以及相互间是如何沟通的。此时可考虑采用一种特殊的图表工具：“统一建模语言”（UML）。请到http://www.rational.com去下载一份UML规格书。作为第1阶段中的描述工具，UML也是很有帮助的。此外，还可用它在第2阶段中处理一些图表（如流程图）。当然并非一定要使用UML，但它对你会很有帮助，特别是在希望描绘一张详尽的图表，让许多人在一起研究的时候。除UML外，还可选择对对象以及它们的接口进行文字化描述（就象我在《Thinking in C++》里说的那样，但这种方法非常原始，发挥的作用亦较有限。
						我曾有一次非常成功的咨询经历，那时涉及到一小组人的初始设计。他们以前还没有构建过OOP（面向对象程序设计）项目，将对象画在白板上面。我们谈到各对象相互间该如何沟通（通信），并删除了其中的一部分，以及替换了另一部分对象。这个小组（他们知道这个项目的目的是什么）实际上已经制订出了设计方案；他们自己“拥有”了设计，而不是让设计自然而然地显露出来。我在那里做的事情就是对设计进行指导，提出一些适当的问题，尝试作出一些假设，并从小组中得到反馈，以便修改那些假设。这个过程中最美妙的事情就是整个小组并不是通过学习一些抽象的例子来进行面向对象的设计，而是通过实践一个真正的设计来掌握OOP的窍门，而那个设计正是他们当时手上的工作！
						作出了对对象以及它们的接口的说明后，就完成了第2阶段的工作。当然，这些工作可能并不完全。有些工作可能要等到进入阶段3才能得知。但这已经足够了。我们真正需要关心的是最终找出所有的对象。能早些发现当然好，但OOP提供了足够完美的结构，以后再找出它们也不迟。
						1.12.5 阶段3：开始创建
						读这本书的可能是程序员，现在进入的正是你可能最感兴趣的阶段。由于手头上有一个计划——无论它有多么简要，而且在正式编码前掌握了正确的设计结构，所以会发现接下去的工作比一开始就埋头写程序要简单得多。而这正是我们想达到的目的。让代码做到我们想做的事情，这是所有程序项目最终的目标。但切不要急功冒进，否则只有得不偿失。根据我的经验，最后先拿出一套较为全面的方案，使其尽可能设想周全，能满足尽可能多的要求。给我的感觉，编程更象一门艺术，不能只是作为技术活来看待。所有付出最终都会得到回报。作为真正的程序员，这并非可有可无的一种素质。全面的思考、周密的准备、良好的构造不仅使程序更易构建与调试，也使其更易理解和维护，而那正是一套软件赢利的必要条件。 构建好系统，并令其运行起来后，必须进行实际检验，以前做的那些需求分析和系统规格便可派上用场了。全面地考察自己的程序，确定提出的所有要求均已满足。现在一切似乎都该结束了？是吗？
						1.12.6 阶段4：校订
						事实上，整个开发周期还没有结束，现在进入的是传统意义上称为“维护”的一个阶段。“维护”是一个比较暧昧的称呼，可用它表示从“保持它按设想的轨道运行”、“加入客户从前忘了声明的功能”或者更传统的“除掉暴露出来的一切臭虫”等等意思。所以大家对“维护”这个词产生了许多误解，有的人认为：凡是需要“维护”的东西，必定不是好的，或者是有缺陷的！因为这个词说明你实际构建的是一个非常“原始”的程序，以后需要频繁地作出改动、添加新的代码或者防止它的落后、退化等。因此，我们需要用一个更合理的词语来称呼以后需要继续的工作。
						这个词便是“校订”。换言之，“你第一次做的东西并不完善，所以需为自己留下一个深入学习、认知的空间，再回过头去作一些改变”。对于要解决的问题，随着对它的学习和了解愈加深入，可能需要作出大量改动。进行这些工作的一个动力是随着不断的改革优化，终于能够从自己的努力中得到回报，无论这需要经历一个较短还是较长的时期。
						什么时候才叫“达到理想的状态”呢？这并不仅仅意味着程序必须按要求的那样工作，并能适应各种指定的“使用条件”，它也意味着代码的内部结构应当尽善尽美。至少，我们应能感觉出整个结构都能良好地协调运作。没有笨拙的语法，没有臃肿的对象，也没有一些华而不实的东西。除此以外，必须保证程序结构有很强的生命力。由于多方面的原因，以后对程序的改动是必不可少。但必须确定改动能够方便和清楚地进行。这里没有花巧可言。不仅需要理解自己构建的是什么，也要理解程序如何不断地进化。幸运的是，面向对象的程序设计语言特别适合进行这类连续作出的修改——由对象建立起来的边界可有效保证结构的整体性，并能防范对无关对象进行的无谓干扰、破坏。也可以对自己的程序作一些看似激烈的大变动，同时不会破坏程序的整体性，不会波及到其他代码。事实上，对“校订”的支持是OOP非常重要的一个特点。
						通过校订，可创建出至少接近自己设想的东西。然后从整体上观察自己的作品，把它与自己的要求比较，看看还短缺什么。然后就可以从容地回过头去，对程序中不恰当的部分进行重新设计和重新实现（注释⑩）。在最终得到一套恰当的方案之前，可能需要解决一些不能回避的问题，或者至少解决问题的一个方面。而且一般要多“校订”几次才行（“设计范式”在这里可起到很大的帮助作用。有关它的讨论，请参考本书第16章）。
						构建一套系统时，“校订”几乎是不可避免的。我们需要不断地对比自己的需求，了解系统是否自己实际所需要的。有时只有实际看到系统，才能意识到自己需要解决一个不同的问题。若认为这种形式的校订必然会发生，那么最好尽快拿出自己的第一个版本，检查它是否自己希望的，使自己的思想不断趋向成熟。
						反复的“校订”同“递增开发”有关密不可分的关系。递增开发意味着先从系统的核心入手，将其作为一个框架实现，以后要在这个框架的基础上逐渐建立起系统剩余的部分。随后，将准备提供的各种功能（特性）一个接一个地加入其中。这里最考验技巧的是架设起一个能方便扩充所有目标特性的一个框架（对这个问题，大家可参考第16章的论述）。这样做的好处在于一旦令核心框架运作起来，要加入的每一项特性就象它自身内的一个小项目，而非大项目的一部分。此外，开发或维护阶段合成的新特性可以更方便地加入。OOP之所以提供了对递增开发的支持，是由于假如程序设计得好，每一次递增都可以成为完善的对象或者对象组。
						⑩：这有点类似“快速造型”。此时应着眼于建立一个简单、明了的版本，使自己能对系统有个清楚的把握。再把这个原型扔掉，并正式地构建一个。快速造型最麻烦的一种情况就是人们不将原型扔掉，而是直接在它的基础上建造。如果再加上程序化设计中“结构”的缺乏，就会导致一个混乱的系统，致使维护成本增加。
						1.12.7 计划的回报
						如果没有仔细拟定的设计图，当然不可能建起一所房子。如建立的是一所狗舍，尽管设计图可以不必那么详尽，但仍然需要一些草图，以做到心中有数。软件开发则完全不同，它的“设计图”（计划）必须详尽而完备。在很长的一段时间里，人们在他们的开发过程中并没有太多的结构，但那些大型项目很容易就会遭致失败。通过不断的摸索，人们掌握了数量众多的结构和详细资料。但它们的使用却使人提心吊胆在意——似乎需要把自己的大多数时间花在编写文档上，而没有多少时间来编程（经常如此）。我希望这里为大家讲述的一切能提供一条折衷的道路。需要采取一种最适合自己需要（以及习惯）的方法。不管制订出的计划有多么小，但与完全没有计划相比，一些形式的计划会极大改善你的项目。请记住：根据估计，没有计划的50％以上的项目都会失败！
													
						