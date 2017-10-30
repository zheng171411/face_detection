package com.zdw.dao;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {
    //mybatis�������ļ�
    String resource = "conf.xml";
    //ʹ�������������mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
    InputStream is = MybatisTest.class.getClassLoader().getResourceAsStream(resource);
    //����sqlSession�Ĺ���
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
    //ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
    //Reader reader = Resources.getResourceAsReader(resource); 
    //����sqlSession�Ĺ���
    //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    //������ִ��ӳ���ļ���sql��sqlSession
    SqlSession session = sessionFactory.openSession();
    /**
     * ӳ��sql�ı�ʶ�ַ�����
     * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
     * getUser��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
     */
    String statement = "me.gacl.mapping.userMapper.getUser";//ӳ��sql�ı�ʶ�ַ���
    //ִ�в�ѯ����һ��Ψһuser�����sql
    //User user = 
    //session.selectOne(statement, 1);
    //System.out.println(user)
}
