package com.gtr.utils.my_program.call_back;

public class Boss {
	private String telNumber = "1360****459";
	
	public void assign(final Worker worker, final String task) {
		System.out.println("---老板开始分配任务---");
		new Thread() {
			@Override
			public void run() {
				// 员工接受老板分配的任务, 并且接受老板吩咐任务完成后要做的事
				worker.accept(task, new OnTaskComplete() {
					@Override
					public void callBack(String solution) {
						System.out.println("打电话给xxx: " + telNumber);
						System.out.println("并且报告解决方案: " + solution);
					}
				});
			}
		}.start();
		System.out.println("----老板分配任务完毕----");
	}

	public void doOtherThings() {
		System.out.println("-----老板去做其他事情了-----");
	}
}
