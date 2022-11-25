package com.tokoonline.project.auditing;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class CrudAuditable {

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @CreationTimestamp
        @Column(name = "tanggalDibuat", updatable = false)
        private Date tanggalDibuat;

        public Date getTanggalDibuat() {
            return tanggalDibuat;
        }

        public void setTanggalDibuat(Date tanggalDibuat) {
            this.tanggalDibuat = tanggalDibuat;
        }

}
