package com.gtr.utils.my_program.call_back;

public class Company {
	public static final String EASY_TASK = "这是一个简单的任务";
	public static final String DIFFICULT_TASK = "这是一个棘手的任务";
	public static final String VERY_DIFFICULT_TASK = "这是一个非常棘手的任务";
	
	public static void main(String[] args) {
		// 老板
		Boss boss = new Boss();
		// 打工仔
		Worker worker = new Worker();
		// 老板给属下员工分配任务
		boss.assign(worker, DIFFICULT_TASK);
		// 派遣完任务后, 老板做其他事情去了
		boss.doOtherThings();
	}
}
