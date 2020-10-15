// pages/tougao/tougao.js
const app = getApp();
const API = require('../../utils/request.js')

Page({

  /**
   * 页面的初始数据
   */
  data: {
    isOriginal:0
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },
  /**
   * 
   */
  radioChange(e) {
    console.log('radio发生change事件，携带value值为：', e.detail.value)
  },
  //投稿按钮
  contribute() {
    API.contribute({
      userId: 1,
      title: "Docker",
      isOriginal: true,
      author: "撒野",
      cover: "https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/docker.png",
      summary: "Docker开源书，涵盖Docker常用命令",
      price: 30,
      downloadUrl: "https://book.douban.com/subject/26285268/"
    }).then( res =>{
      const request = JSON.parse(res)
      console.log(request)
      this.setData({
        userInfo:app.globalData.user
      })
    })
  }
})