package com.zbw.fame.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import tk.mybatis.mapper.annotation.Order;

import java.util.Date;

/**
 * 评论 Model
 *
 * @author zbw
 * @since 2018/1/19 16:27
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class Comments extends BaseEntity {

    /**
     * 所属文章id
     */
    private Integer articleId;

    /**
     * 父评论id
     */
    private Integer pId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 昵称
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 网址
     */
    private String website;

    /**
     * 评论时间
     */
    @Order("desc")
    private Date created;

    /**
     * 赞
     */
    private Integer agree;

    /**
     * 踩
     */
    private Integer disagree;

    /**
     * 评论ip
     */
    private String ip;

    /**
     * 评论agent
     */
    private String agent;
}
