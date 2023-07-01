package com.mango.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mango
{
    @Id
    private String id;
    private int m_Id;
    private String m_Name;
    private String m_Type;

    // constructor
        public Mango(int m_Id, String m_Name, String m_Type)
        {
            this.m_Id = m_Id;
            this.m_Name = m_Name;
            this.m_Type = m_Type;
        }
}
