/**
 * Created by ios on 16/11/15.
 */
package com.qf.chapter24.memento;

/**
 *  备忘录模式:
 *      在不破坏封装的前提下,捕获一个对象内部的状态,并在该对象之外保存这个状态.这样以后就可以将该对象恢复到原先保存的状态
 *
 *  标准的备忘录模式在项目中很难遇到,一般都是经过一些变化处理
 *
 *  使用场景:
 *      1.需要保存和恢复数据的相关场景
 *      2.提供一个可回滚的操作,比如ctrl + z, back按钮, backspace键
 *      3.需要监控的副本场景中.  例如监控一个对象的属性,但是不应该作为系统的主业务来调用,因此一般做法是备份一个主线程中的对象,然后由分析程序来分析
 *      4.数据库连接的事务管理就是用备忘录模式.
 *
 *  注意事项:
 *      1.备忘录的生命周期
 *          备忘录创建出来就要在『最近』的代码中使用,要主动管理它的生命周期,不实用就要立刻删除他的引用,等待垃圾回收器对它回收处理
 *      2.备忘录性能
 *          不要在频繁建立备份的场景中使用备忘录模式,比如for循环中
 *              1.控制不了备忘录简历的对象数量
 *              2.大对象的建立是要消耗资源的,系统性能需要考虑.
 *
 *
 *    如果考虑对象的安全问题,可以考虑使用双接口.
 *    1.正常业务接口,宽接口
 *      实现必要的业务逻辑
 *    2.空接口,窄接口:
 *      提供给子系统外的模块访问,比如容器对象,由于窄接口中没有提供任何操作数据的方法,因此相对来说比较安全
 *
 *    *******
 *    *  在使用数据库的时候,不要使用数据库的临时表来缓存备份数据,它加大了数据库操作的频繁度,把压力下放到了数据库
 *    * ,最好的解决方法就是使用备忘录模式.
 *    *******/