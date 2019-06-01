java io 中的装饰者模式:  
InputStream 是 (装饰者 和 被装饰者 的) 超类.
  
FileInputStream, ByteArrayInputStream 等 是 被装饰者.  

FilterInputStream 是 抽象装饰者.  
BufferedInputStream 等 是 具体装饰者.  

----

这里的示例 演示如何继承 抽象装饰者 FilterInputStream, 实现自己的 具体装饰效果:  
把所有读到的大写字母 转成 小写.  
