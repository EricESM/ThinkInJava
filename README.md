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
				
				
			