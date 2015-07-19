package com.gtr.utils.my_program.call_back;

public class Worker {
	public void accept(String task, OnTaskComplete followUpWork) {
		if (Company.EASY_TASK.equals(task)) {
			solve(task, 1, 3);
			if (followUpWork != null) {
				followUpWork.callBack("解决方案A");
			}
		} else if (Company.DIFFICULT_TASK.equals(task)) {
			solve(task, 4, 10);
			if (followUpWork != null) {
				followUpWork.callBack("解决方案B");
			}
		} else {
			System.out.println("该任务中的需求过于复杂，需要大家开会讨论");
		}
	}
	
	private void solve(String task, int bestTime, int worstTime) {
		int actualTime = (int) (Math.random() * (worstTime - bestTime + 1)) + bestTime;
		try {
			Thread.sleep(actualTime * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("解决任务( " + task + " )实际耗时: " + actualTime);
	}
}
