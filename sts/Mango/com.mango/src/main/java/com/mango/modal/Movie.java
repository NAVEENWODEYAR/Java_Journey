package com.mango.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie
{
    @Id
    private String id;
    private int m_Id;
    private String m_Name;
    private String m_Type;
    private String m_Language;

    // parameterized constructor..,
        public Movie(int m_Id, String m_Name, String m_Type, String m_Language)
        {
            this.m_Id = m_Id;
            this.m_Name = m_Name;
            this.m_Type = m_Type;
            this.m_Language = m_Language;
        }


}
