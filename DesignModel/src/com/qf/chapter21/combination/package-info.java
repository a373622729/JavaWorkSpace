/**
 * Created by ios on 16/11/10.
 */
package com.qf.chapter21.combination;

/**
 *  组合模式: 合成模式: 部分-整体模式
 *      主要是用来描述部分与整体的关系,  比如公司里层级结构
 *      将对象组合成树形结构以表示 "部分-整体" 的层次结构,使得用户对单个对象和组合对象的使用具有一致性
 *
 *  组合模式,对依赖倒置原则 有一定的破坏,但是它还有其他类型的变形.
 *
 *  使用场景:
 *      1.维护和展示 部分-整体关系的场景,如,树形菜单,文件和文件夹管理
 *      2.从一个整体中能够独立出来部分模块或功能的场景
 *
 *  注意事项:
 *      只要是树形结构,就可以考虑使用组合模式
 *      只要体现局部和整体的关系的时候,就考虑一下组合模式
 *
 */