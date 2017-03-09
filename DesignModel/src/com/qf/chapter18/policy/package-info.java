/**
 * Created by ios on 16/11/4.
 */
package com.qf.chapter18.policy;

/**
 *  策略模式,也叫政策模式
 *      定义一组算法,将每个算法都封装起来,并且使他们之间可以互换
 *
 *  策略模式的重点就是封装角色,他和代理的差别就是, 策略模式的封装角色（Context）和被封装的策略（Strategy）不用是同一个接口,如果是的话,那就变成了代理模式
 *
 *  使用场景:
 *      1.多个类只有在算法或行为上稍有不同的场景
 *      2.算法需要自由切换的场景
 *      3.需要屏蔽算法规则的场景
 *
 *  注意事项:
 *      如果一个策略家族的具体策略超过4个,那么久考虑使用混合模式,来解决策略类的膨胀和对外暴露的问题
 *
 *      策略枚举:
 *          虽然很优秀和方便,但是受到枚举类型的限制,每个枚举项都是 public,final,static的,扩展性收到了一定的约束,因此在开发中,策略枚举一般
 *          担当不经常发生变化的角色
 */