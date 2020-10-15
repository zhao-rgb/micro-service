package com.soft1851.usercenter.rocketmq;

/**
 * @author zhao
 * @className AddBonusListener
 * @Description TODO
 * @Date 2020/10/7
 * @Version 1.0
 **/
//@Service
//@RocketMQMessageListener(consumerGroup = "consumer", topic = "add-bonus")
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//public class AddBonusListener implements RocketMQListener<UserAddBonusMsgDTO> {
//
//    private final UserMapper userMapper;
//    private final BonusEventLogMapper bonusEventLogMapper;
//
//    @Override
//    public void onMessage(UserAddBonusMsgDTO userAddBonusMsgDTO) {
//        //1、为用户加积分
//        Integer userId = userAddBonusMsgDTO.getUserId();
//        User user = this.userMapper.selectByPrimaryKey(userId);
//        user.setBonus(user.getBonus() + userAddBonusMsgDTO.getBonus());
//        this.userMapper.updateByPrimaryKeySelective(user);
//        //2、写积分日志
//        this.bonusEventLogMapper.insert(BonusEventLog.builder()
//                .userId(userId)
//                .value(userAddBonusMsgDTO.getBonus())
//                .event("CONTRIBUTE")
//                .createTime(Timestamp.valueOf(LocalDateTime.now()))
//                .description("投稿加积分")
//                .build()
//        );
//    }
//}
