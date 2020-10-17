// pages/tougao/tougao.js
const app = getApp();
const API = require('../../utils/request.js')

Page({

  /**
   * 页面的初始数据
   */
  data: {
    isOriginal: 0,
    title: '',
    author: '',
    price: 20,
    summary: '',
    cover: '',
    downloadUrl: '',

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
    // app.globalData.isOriginal = e.detail.value
  },
  //投稿按钮
  contribute() {
    console.log(app.globalData.isOriginal)
    API.contribute({
      userId: app.globalData.user.id,
      title: this.data.title,
      isOriginal: app.globalData.isOriginal,
      author: this.data.author,
      cover: "https://kkkksslls.oss-cn-beijing.aliyuncs.com/campus/java.png",
      summary: this.data.summary,
      price: this.data.price,
      downloadUrl: this.data.downloadUrl
    }).then(res => {
      const request = JSON.parse(res)
      console.log(request)
      this.setData({
        userInfo: app.globalData.user
      })
    })
    wx.showModal({
      title: '投稿成功',
      content: '投稿成功了哦！！！',
      success: function (res) {
        if (res.confirm) {
          console.log('用户点击确定')
          //Tab跳转到主页
          wx.switchTab({
            url: '../index/index'
          })
        } else if (res.cancel) {
          console.log('用户点击取消')
          //Tab跳转到主页
          wx.switchTab({
            url: '../index/index'
          })
        }
      }
    })
  },
  titleInput: function (e) {
    this.setData({
      title: e.detail.value
    });
  },
  authorInput: function (e) {
    this.setData({
      author: e.detail.value
    });
  },
  priceInput: function (e) {
    this.setData({
      price: e.detail.value
    });
  },
  summaryInput: function (e) {
    this.setData({
      summary: e.detail.value
    });
  },
  downloadUrlInput: function (e) {
    this.setData({
      downloadUrl: e.detail.value
    });
  }
})