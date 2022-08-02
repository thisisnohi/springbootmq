# springbootmq


## 脚本
见： docs/建立队列脚本_(测试QMTest1).cmda 、建立队列脚本_(测试QMTest2).cmda

## 常见问题
* 2035 授权错误，见 MQ.md

```yaml
RUNMQSC 队列管理器名称
ALTER QMGR CHLAUTH(DISABLED)
#修改连接认证策略
ALTER AUTHINFO(SYSTEM.DEFAULT.AUTHINFO.IDPWOS) AUTHTYPE(IDPWOS) CHCKCLNT(OPTIONAL)
#或者关闭连接认证
ALTER QMGR CONNAUTH(' ')   
#最后刷新连接认证策略
REFRESH SECURITY TYPE(CONNAUTH)

--关闭认证
ALTER QMGR CHLAUTH(DISABLED) 
REFRESH SECURITY TYPE(CONNAUTH)

20220802 通过如下修改，成功连接mq
ALTER CHANNEL(SYSTEM.DEF.SVRCONN) CHLTYPE(SVRCONN) MCAUSER('')  或者MCAUSER('mqm')
```

## 常用命令
* 向队列放消息： `amqsput 队列名称 队列管理器名称`
  `amqsput QMTEST2.QR1 QMTEST2` 命令执行后 输入消息 回车
* 从队列取消息： `amqsget 队列名称 队列管理器名称`
  `amqsget QMTEST1.QL1 QMTEST1`
