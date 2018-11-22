1 个 producer 线程 sleep(1000) 然后生产一个随机数
固定有 64 consumer 线程等待 producer 线程生产这个随机数，等待有数据了，分别 sleep(1000) 之后去并发打印这个随机数，之后再通知 producer 生成第二个随机数
如此这样循环 100 次

表现出来的时序是这样的：
第1s：producer 生产随机数  
第2s: 64 个 consumer 线程并发打印
第3s：producer 生产随机数 
第4s: 64 个 consumer 线程并发打印
...
第199s：producer 生产随机数  
第200s: 64 个 consumer 线程并发打印