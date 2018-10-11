package com.exa.springboot.mapper;

import com.exa.springboot.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

//    where （NAME） like concat('%',#{NAME},'%')
    @Select("select * from jnshu_students where id = #{id}")
    Student findByID(int id);

    @Select("select * from jnshu_students where (stuName) like concat('%',#{name},'%')")
    List<Student> findByName(String name);

}
