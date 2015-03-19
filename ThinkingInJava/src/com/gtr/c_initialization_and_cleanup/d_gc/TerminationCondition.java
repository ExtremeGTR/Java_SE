package com.gtr.c_initialization_and_cleanup.d_gc;

/**
 * finalize方法
 *   - java的垃圾回收器负责回收无用对象所占据的内存资源, 即由new分配的内存
 *     但是它不知道如何释放非new分配的内存, 此时就需要finalize方法做特定的清理工作了
 *   
 *   - 一旦垃圾回收器准备好释对象所占用的内存, 首先会调用finalize方法
 *   
 *   - finalize方法主要用于释放"本地方法"的内存资源, "本地方法"即在Java中调用非Java代码
 * 
 * @author GT-R
 * @date 2015年3月13日 下午2:19:36
 */
public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		// proper clean up
		novel.checkIn();
		// drop the reference, forget to clean up
		new Book(true);
		// force garbage collection & finalization
		System.gc();
	}
}

class Book {
	boolean checkedOut = false;
	
	Book(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	void checkIn() {
		checkedOut = false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		if (checkedOut) {
			System.out.println("Error: checked out");
			// normally. you'll also do this
			// super.finalize() // call the base-class version
		}
	}
}
