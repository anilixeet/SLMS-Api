/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scolere.lms.service.iface;

import com.scolere.lms.domain.exception.LmsServiceException;
import com.scolere.lms.domain.vo.ClassMasterVo;
import com.scolere.lms.domain.vo.SchoolMasterVo;
import java.util.List;
import my.java.interfac.HomeRoomMasterVo;

/**
 *
 * @author dell
 */
public interface CommonServiceIface {
    
    /*SCHOOL RELATED METHODS*/
    boolean updateSchoolMasterDetail(SchoolMasterVo vo) throws LmsServiceException;
    void saveSchoolMasterDetail(SchoolMasterVo vo) throws LmsServiceException;
    boolean deleteSchoolMasterDetail(SchoolMasterVo vo) throws LmsServiceException;
    SchoolMasterVo getSchoolMasterDetail(int id) throws LmsServiceException;
    List<SchoolMasterVo> getSchoolMasterVoList() throws LmsServiceException;
    
    /* CLASS RELATED METHODS */
    boolean updateClassDetail(ClassMasterVo  vo) throws LmsServiceException;
    void saveClassDetail(ClassMasterVo   vo) throws LmsServiceException;
    boolean deleteClassDetail(ClassMasterVo   vo) throws LmsServiceException;
    ClassMasterVo  getClassDetail(int id) throws LmsServiceException;
    List<ClassMasterVo > getClassVoList() throws LmsServiceException; 
    
    /*HRM RELATED METHODS*/
    boolean updateHomeRoomMasterDetail(HomeRoomMasterVo  vo) throws LmsServiceException;
    void saveHomeRoomMasterDetail(HomeRoomMasterVo   vo) throws LmsServiceException;
    boolean deleteHomeRoomMasterDetail(HomeRoomMasterVo   vo) throws LmsServiceException;
    HomeRoomMasterVo  getHomeRoomMasterDetail(int id) throws LmsServiceException;
    List<HomeRoomMasterVo > getHomeRoomMasterVoList() throws LmsServiceException;    
        
    
}
