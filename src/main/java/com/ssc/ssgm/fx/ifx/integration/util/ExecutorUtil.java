package com.ssc.ssgm.fx.ifx.integration.util;


import java.util.concurrent.*;

public class ExecutorUtil {

    private static ThreadPoolExecutor asyncTaskExecutor = new ThreadPoolExecutor(10, 25, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(20), new ThreadPoolExecutor.CallerRunsPolicy());

    private static ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(4);

    //expect to execute concurrent tasks
    private static ThreadPoolExecutor parallelTaskExecutor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.CallerRunsPolicy());

    public static ThreadPoolExecutor getAsyncTaskExecutor() {
        return asyncTaskExecutor;
    }

    public static ScheduledExecutorService getScheduledExecutor() {
        return scheduledExecutor;
    }

    public static ThreadPoolExecutor getParallelTaskExecutor() {
        return parallelTaskExecutor;
    }

}