<?php



use PHPUnit\Framework\TestCase;
use App\Validate;

class ValidateTest extends TestCase
{
    public function test_email()
    {


        $email2 = Validate::email("pevv@gmail.com");
        $this->assertTrue($email2);
    }

    public function test_url()
    {

        $url = Validate::url('http://jvz.com');
        $this->assertTrue($url);
    }

    public function test_password(){
        $password = Validate::password('1s23456');
        $this->assertFalse($password);
    }
}
